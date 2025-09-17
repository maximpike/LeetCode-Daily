const sum = require('../../src/easy/AddTwoIntegers');

describe('AddTwoIntegers', () => {
    test('adds two positive numbers', () => {
        expect(sum(1, 2)).toBe(3);
    });

    test('adds negative and positive numbers', () => {
        expect(sum(-6, 25)).toBe(19);
    });

    test('adds numbers up equal to zero', () => {
        expect(sum(-6, 6)).toBe(0);
    });

    test('adds two negative numbers', () => {
        expect(sum(-3, -7)).toBe(-10);
    });
})