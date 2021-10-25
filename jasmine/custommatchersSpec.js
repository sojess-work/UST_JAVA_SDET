var myCustomMatchers= {
    toBeAllowedToDrive: function(){
        return {
            compare:function(age){
                var result = {}
                    result.pass = age>16
                    if(result.pass){
                        result.message = "Expected" + age + "to be allowed to drive";
                    }else{
                        result.message = "Expected"+age+ "to be allowed to drive,but it was not";
                    }
                    return result;
                
            }
        };
    }
};

describe("Custom matcher: toBeAllowedToDrive", function(){
    var john=17,
    mary =16;
    beforeEach(function(){
        jasmine.addMatchers(myCustomMatchers);
    });
    it("should allow john to drive", function(){
        expect(john).toBeGreaterThan(16);
    });
    it("should not allow mary to drive",function(){
        expect(mary).not.toBeAllowedToDrive();
        expect(mary).not.toBeGreaterThan(16);
    });
});