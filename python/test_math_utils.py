from math_utils import MathUtils

def test_add():
    assert MathUtils.add(2, 3) == 5
    assert MathUtils.add(-1, 1) == 0

def test_subtract():
    assert MathUtils.subtract(10, 3) == 7
    assert MathUtils.subtract(0, 5) == -5

def test_multiply():
    assert MathUtils.multiply(4, 5) == 20
    assert MathUtils.multiply(-2, 3) == -6

def test_divide():
    assert MathUtils.divide(10, 2) == 5
    assert MathUtils.divide(1, 0) == -1.0
