const promiseP = () =>{ return new Promise((resolve,reject) => {
    resolve("Hello promise p")
});
}
const promiseQ = () =>{ return new Promise((resolve,reject) => {
    resolve("Hello promise Q")
});
}
const promiseR = () =>{ return new Promise((resolve,reject) => {
    resolve("Hello promise R")
});
}

promiseP().then((p) => {
    console.log(p);
    return promiseQ();
}).then((Q) => {
    console.log(Q);
    return promiseR();
}).then((r) => {
    console.log(r);
    
})

