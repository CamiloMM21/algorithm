function tsp(cities) {
    // Inicializar el camino con la primera ciudad
    const path = [0];
    
    // Calcular la distancia entre todas las ciudades
    const distances = new Array(cities.length);
    for (let i = 0; i < cities.length; i++) {
      distances[i] = new Array(cities.length);
      for (let j = 0; j < cities.length; j++) {
        distances[i][j] = distance(cities[i], cities[j]);
      }
    }
    
    // Mientras queden ciudades por visitar
    while (path.length < cities.length) {
      let lastCity = path[path.length - 1];
      let nextCity = null;
      let minDistance = Infinity;
      
      // Encontrar la ciudad más cercana que no haya sido visitada
      for (let i = 0; i < cities.length; i++) {
        if (!path.includes(i) && distances[lastCity][i] < minDistance) {
          nextCity = i;
          minDistance = distances[lastCity][i];
        }
      }
      
      // Añadir la siguiente ciudad al camino
      path.push(nextCity);
    }
    
    // Añadir la primera ciudad al final del camino
    path.push(0);
    
    return path;
  }
  
  function distance(city1, city2) {
    const dx = city2[0] - city1[0];
    const dy = city2[1] - city1[1];
    return Math.sqrt(dx*dx + dy*dy);
  }
  
  // Ejemplo de uso
  const cities = [
    [0, 0], // Ciudad 0
    [1, 1], // Ciudad 1
    [2, 2], // Ciudad 2
    [3, 3], // Ciudad 3
    [4, 4]  // Ciudad 4
  ];
  
  const path = tsp(cities);
  console.log(path); // [0, 1, 2, 3, 4, 0]