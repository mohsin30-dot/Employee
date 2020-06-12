package com.getmehired;

public  class Employee {
        // write your code here
        private String name;
        private String address;
        private int number;

    public Employee(String name, String address, int number){
            System.out.println("constructing an employee");
            this.name = name;
            this.address = address;
            this.number = number;
        }
        public void mailCheck () {
            System.out.println("mailing a check to" + this.name + "" + this.address);
        }
        public String toString () {
            return name + " " + address + " " + number;
        }
        public String getName () {
            return name;
        }
        public String getAddress () {
            return address;
        }
        public void setAddress (String newAddress){
            address = newAddress;
        }
        public int getNumber () {
            return number;
        }

        /* lets extend Employee class , file name Salary.java */
    /*
        public static class Salary extends Employee {
            private double salary; // annual Salary

            public Salary(String name, String address, int number, double Salary) {
                super(name, address, number);
                setSalary(salary);
            }

            public double getSalary() {
                return salary;
            }

            public void mailCheck() {
                System.out.println("within mailCheck of salary class");
                System.out.println("mailing check to" + getName() + "with salary" + salary);
            }

            public void setSalary(double newSalary) {
                if (newSalary >= 0.0) {
                    salary = newSalary;
                }
            }

            public double computePay() {
                System.out.println("computing salary pay for" + getName());
                return salary / 52;
            }
        }
*/
        /* file name virtual.java */
        //public class VirtualDemo {
            public static void main(String[] args) {
                //Salary s = new Salary("Mohsin Rubel", "Alexandria,VA", 3, 3600.00);
                //Employee e = new Employee("John Adams", "Boston, MA", 2, 2400.00);
                System.out.println("Call mailCheck using Salary reference --");
                //s.mailCheck();
                System.out.println("\n Call mailCheck using Employee reference--");
                //e.mailCheck();

            }
        //}


    }

