function maxNumber(numbers) {
    let max = numbers[0];
    for (let i = 1; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
    }
    return max;
  }
  
  // Ejemplo de uso
  const numbers = [5, 2, 9, 1, 7];
  const max = maxNumber(numbers);
  console.log(max); // 9
  