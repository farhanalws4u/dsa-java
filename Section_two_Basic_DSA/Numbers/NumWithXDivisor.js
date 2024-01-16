class NumWithXDivisor {
  findNumOfDivisors(range, x) {
    let finalCount = 0;

    for (let i = 1; i <= range; i++) {
      let factors = 0;
      for (let j = 1; j <= i; j++) {
        if (i % j === 0) {
          factors++;
        }
      }
      factors === x && finalCount++;
    }

    return finalCount;
  }

  isPrime = (num) => {
    if (num < 2) {
      return false;
    }

    for (let i = 2; i < Math.sqrt(num); i++) {
      if (num % i === 0) return false;
    }

    return true;
  };
}

const obj = new NumWithXDivisor();

console.log(obj.findNumOfDivisors(7, 2));
