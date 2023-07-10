package ss06_inheritance.practice;

public class Shape {

        protected String color ="red";
        protected boolean filled= true;
        protected Shape(String color, boolean filled){
            this.color = this.color;
            this.filled= this.filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        @Override
        public String toString() {
            return "Shape{" +
                    "color='" + color + '\'' +
                    ", filled=" + filled +
                    '}';
        }

    }

