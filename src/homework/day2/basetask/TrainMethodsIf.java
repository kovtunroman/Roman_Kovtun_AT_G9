package homework.day2.basetask;

public class TrainMethodsIf {
    public int returnNewInt(int inputNumber) {
        return (inputNumber < 8) ? (inputNumber * 7) : (inputNumber / 4);
    }

    public long returnNewLong(int inputNumber) {
        return (inputNumber > 300) ? (inputNumber - 300) : (inputNumber + 20);
    }

    public String returnNewChar(char inputChar) {
        if (inputChar == 'g') {
            return "go";
        } else {
            return new String(new char[]{'o', inputChar});
        }
    }

    public float returnNewFloat(float inputNumber) {
        return (inputNumber == 0.67) ? inputNumber : (inputNumber * 2);
    }

    public double returnNewDouble(double inputNumber) {
        if (inputNumber > 30 && inputNumber < 80) {
            return inputNumber + 87;
        } else if (inputNumber > 80 && inputNumber < 400) {
            return inputNumber - 87;
        } else if (inputNumber > 400) {
            return inputNumber / 4;
        } else {
            return inputNumber;
        }
    }

    public void returnNewBoolean(boolean inputFlag) {
        if (inputFlag) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }
}
