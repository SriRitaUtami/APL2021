public class BlackAdapter implements Green
{

    Black black;
    public BlackAdapter(Black black)
    {

        this.black = black;
    }
    @Override
    public void flavor()
    {

        black.taste();
    }
}