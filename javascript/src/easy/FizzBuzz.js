/**
 * @param {number} n
 * @return {string[]}
 */
let fizzBuzz = function (n) {
    let answer = [];
    for (let i = 1; i <= n; i++) {
        let currentString = "";
        if (i % 3 === 0) {
            currentString += "Fizz"
        }
        if (i % 5 === 0) {
            currentString += "Buzz";
        }
        if (currentString === "") {
            currentString += i.toString();
        }
        answer.push(currentString);
    }
    return answer;
};

module.exports = fizzBuzz