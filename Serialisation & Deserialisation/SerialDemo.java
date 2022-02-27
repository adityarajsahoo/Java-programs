class SerialDemo implements java.io.Serializable
{
    String day;
    String time;

    public SerialDemo(String day, String time)
    {
        this.day = day;
        this.time = time;
    }
}