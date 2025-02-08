import java.util.Random;

public class Car
{
    private final Random random = new Random();
    private String carName = "";

    private int curPos = 0;

    public void setCarName(String name)
    {
        carName = name;
    }

    public String getCarName()
    {
        return carName;
    }

    public int getCarPos()
    {
        return curPos;
    }

    private void printCurPos()
    {
        System.out.println(carName + " : " + "-".repeat(curPos));
    }

    public int MoveCar()
    {
        int randomSpeed = random.nextInt(10);

        if (randomSpeed >= 4)
            curPos += 1;

        printCurPos();
        return curPos;
    }
}