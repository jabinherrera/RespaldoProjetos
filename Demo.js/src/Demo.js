console.log("Hello world!");

console.log("--------------------------------")

const name = "Jabin"

const lastName = "Herrera"

const nameAndLastName = name + lastName;

console.log(nameAndLastName)

const nameAndLastName2 = `${name} ${lastName}`;

console.log(nameAndLastName2)

const nameAndLastName3 = `name ${lastName}`;

console.log(nameAndLastName3)

console.log("--------------------------------")

let numero = 123;

console.log(numero)
console.log(typeof numero)

numero=numero.toString()

console.log(numero)
console.log(typeof numero)

numero=parseInt(numero)

console.log(numero)
console.log(typeof numero)

console.log("--------------------------------")

let price = 0

let message = (price < 10) ? 'expensive' : 'cheap';

console.log(message);

console.log("--------------------------------")

const names = ["Jabin", "Priscila"]

for (let i = 0; i<names.length; i++) {
    console.log(names[i]);
}

for (let name of names) {
    console.log(name);
}

names.forEach(name => {
    console.log(name)
});

console.log("--------------------------------")

console.log("Empece")

names.forEach(name =>{
    setTimeout(function () {
        console.log(`Hola ${name}`)
    }, 5000)
})


console.log("Termine")