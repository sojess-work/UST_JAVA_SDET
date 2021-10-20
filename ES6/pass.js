class Password {
    constructor(pwdStr){
        this.PWD = hashCode(pwdStr);
    }
    [Symbol.match](pwdStr){
        return this.PWD=== hashCode(pwdStr);
    }
}
let securePassword =  new Password('password')
console.log('password'.match(securePassword))
console.log('notmypassword'.match(securePassword));