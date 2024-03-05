package org.example;

public class Vector {
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    private int x;
    private int y;
    private int z;

    public Vector(){
        x = 0;
        y = 0;
        z = 0;

    }

    public Vector(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @apiNote Метод вычисляет длину вектора
     * @return длина
     */
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @apiNote вычисляем скалярное произведения
     * @param vectorTwo умножение
     * @return
     */
    public double projectScalar(Vector vectorTwo) {

        return x * vectorTwo.x + y * vectorTwo.y + z * vectorTwo.z;
    }

    public Vector vectorMultiplication(Vector vector2) {
        return new Vector(
                y * vector2.z - z * vector2.y,
                z * vector2.x - x * vector2.z,
                x * vector2.y - y * vector2.x
                );
    }

    public double cos(Vector vectorTwo) {
        return projectScalar(vectorTwo) / (vectorTwo.length() * length());

    }
}
