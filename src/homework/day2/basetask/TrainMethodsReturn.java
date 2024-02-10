package homework.day2.basetask;

public class TrainMethodsReturn {
    public int returnNewInt(int inputNumber) {
        return 3 * inputNumber;
    }

    public long returnNewLong(long inputNumber) {
        return inputNumber - 4;
    }

    public String returnNewChar(char inputChar) {
        return new String(new char[]{inputChar, inputChar});
    }

    public float returnNewFloat(float inputNumber) {
        return inputNumber / 2;
    }

    public double returnNewDouble(double inputNumber) {
        return inputNumber + 8;
    }

    public short returnNewShort(short inputNumber) {
        return (short) (inputNumber - 1);
    }

    public byte returnNewByte(byte inputNumber) {
        return (byte) (inputNumber * 2);
    }

    public boolean returnNewBoolean(boolean inputFlag) {
        return !inputFlag;
    }
}
