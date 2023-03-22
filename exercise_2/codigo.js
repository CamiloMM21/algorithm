// function maxNumber(numbers) {
//     let max = numbers[0];
//     for (let i = 1; i < numbers.length; i++) {
//       if (numbers[i] > max) {
//         max = numbers[i];
//       }
//     }
//     return max;
//   }
  
//   // Ejemplo de uso
//   const numbers = [5, 2, 9, 1, 7];
//   const max = maxNumber(numbers);
//   console.log(max); // 9


//   //por mejorar la logica


// const minsum =(num)=>{
//   const min = nums[0];
//   for (let i = 0; i < array.length; i++) {
//     const element = array[i];
    
//   }

//   const nums ={
//    "numbe":[ 0, 3, 4, 5, 3, 5, 8, 9, 5, ],
//    "text":["el numero es ","hola","xd","eres rancio"]}
//   console.log(min)

// }

// let nums = [1, 2, 3, 4, 5, 6, 7, 8, 9];
// let sum = 0;

// for (let i = 0; i < nums.length; i++) {
//   if (nums[i] % 2 === 0) {
//     sum += nums[i];
//   }
// }

// console.log(sum); // output: 20

let nums = [1, 2, 3, 4, 5, 6, 7, 8, 9];
let sum = nums.filter(n => n % 2 === 0).reduce((a, b) => a + b, 0);

console.log(sum)

  