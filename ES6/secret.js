const SECRET = Symbol('secret')
let data= {}
data[SECRET]=10
let newData= Object.assign({},data)
Object.getOwnPropertyNames(data)
console.log((SECRET in data))
console.log((SECRET in newData))