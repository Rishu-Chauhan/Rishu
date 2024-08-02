public class ComplexNumber {
        private double real;
        private double imaginary;
    
        // Constructor
        public ComplexNumber(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }
    
        // Method to add two complex numbers
        public ComplexNumber add(ComplexNumber other) {
            double newReal = this.real + other.real;
            double newImaginary = this.imaginary + other.imaginary;
            return new ComplexNumber(newReal, newImaginary);
        }
    
        // Method to subtract two complex numbers
        public ComplexNumber subtract(ComplexNumber other) {
            double newReal = this.real - other.real;
            double newImaginary = this.imaginary - other.imaginary;
            return new ComplexNumber(newReal, newImaginary);
        }
    
        // Method to multiply two complex numbers
        public ComplexNumber multiply(ComplexNumber other) {
            double newReal = this.real * other.real - this.imaginary * other.imaginary;
            double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
            return new ComplexNumber(newReal, newImaginary);
        }
    
        // Method to get the real part of the complex number
        public double getReal() {
            return real;
        }
    
        // Method to get the imaginary part of the complex number
        public double getImaginary() {
            return imaginary;
        }
    
        // Method to display the complex number in a readable format
        public String toString() {
            return real + " + " + imaginary + "i";
        }
    
        // Main method for testing
        public static void main(String[] args) {
            // Creating two complex numbers
            ComplexNumber c1 = new ComplexNumber(3, 4); // 3 + 4i
            ComplexNumber c2 = new ComplexNumber(1, -2); // 1 - 2i
    
            // Performing addition
            ComplexNumber sum = c1.add(c2);
            System.out.println("Sum: " + sum); // Output: 4 + 2i
    
            // Performing subtraction
            ComplexNumber difference = c1.subtract(c2);
            System.out.println("Difference: " + difference); // Output: 2 + 6i
    
            // Performing multiplication
            ComplexNumber product = c1.multiply(c2);
            System.out.println("Product: " + product); // Output: 11 - 2i
        }
    }
    

