package seedData;

public class json {
    public class Rectangle {
        private int width;
        private int height;
        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }
        public int getArea() {
            return width * height;
        }
    }
    public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
    }
}
