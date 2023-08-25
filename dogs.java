class dogs 
{
    String breed;
    String size;
    String age;
    String color;

    public String getinfo()
    {
        return ("breed=" + breed + " size=" + size + " age=" + age + " color=" + color);

    }
    public static void main(String[] args)
    {
        dogs d1 = new dogs();
        d1.breed = "Labrador";
        d1.size = "small";
        d1.age = "2";
        d1.color = "brown";
        System.out.println(d1.getinfo());
    }
}