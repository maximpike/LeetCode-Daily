const fizzBuzz = require("../../src/easy/FizzBuzz");

describe("Fizzbuzz", () => {

    test("return one Fizz when n is equal to 3", () => {
       expect(fizzBuzz(3)).toStrictEqual(["1","2","Fizz"]);
    });

    test("return one Fizz and one Buzz when n is equal to 3", () => {
       expect(fizzBuzz(5)).toStrictEqual(["1","2","Fizz","4","Buzz"]);
    });

    test("return four Fizz, two Buzz and one Fizzbuzz when n is equal to 15", () => {
       expect(fizzBuzz(15)).toStrictEqual(["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]);
    });

    test("return 1 when n is equal min value", () => {
       expect(fizzBuzz(15)).toStrictEqual(["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]);
    });

    test("return number, Fizz, Buzz or FizzBuzz for spot checks when n is equal max value", () => {
        let result = fizzBuzz(10_000)
        expect(result.length).toStrictEqual(10_000)
        expect(result[0]).toStrictEqual("1");           // 1st element
        expect(result[2]).toStrictEqual("Fizz");        // 3rd element
        expect(result[4]).toStrictEqual("Buzz");        // 5th element
        expect(result[14]).toStrictEqual("FizzBuzz");   // 15th element
        expect(result[269]).toStrictEqual("FizzBuzz");  // 270th element
        expect(result[510]).toStrictEqual("511");       // 511th element
        expect(result[9999]).toStrictEqual("Buzz");     // 10,000th
    });

});