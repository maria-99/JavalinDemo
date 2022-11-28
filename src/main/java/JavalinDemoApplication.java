import io.javalin.Javalin;

public class JavalinDemoApplication {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7070);
        app.get("/hello", ctx -> ctx.result("Hello World from Javalin"));
    }
}