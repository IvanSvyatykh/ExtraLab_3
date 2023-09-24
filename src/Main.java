public class Main {

    public static void main(String[] args) {

        Frame frame = new Frame("Login",
                new HorizontalLayout(
                        new VerticalLayout(
                                new Rectangle(new Text("User")),
                                new Rectangle(new Text("Password")),


                                new HorizontalLayout(
                                        new Rectangle(new Text("Ok")),
                                        new Rectangle(new Text("Cancel"))
                                )
                        ),
                        new Frame("Help",
                                new VerticalLayout(
                                        new Text("Please enter login"),
                                        new Text("  and password"),
                                        new Text("Then press Ok button")
                                )
                        )
                )
        );


        frame.calculate();

        char[][] result = new char[frame.getHeight()][frame.getWidth()];

        frame.draw(result);

        print(result);
    }

    static void print(char[][] result) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {

                System.out.print(result[i][j]);


            }
            System.out.println();
        }
    }
}
