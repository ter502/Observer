public class Television implements Channel{
    @Override
    public void update(String score) {
        System.out.println(score + ": on Television");
    }
}
