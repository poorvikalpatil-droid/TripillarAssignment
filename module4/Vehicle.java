package com.assignment2.module4;

interface Vehicle {
        void start();
    }

    class Car implements Vehicle {
        @Override
        public void start() {
            System.out.println("Car has started.");
        }

        public static void main(String[] args) {
            Vehicle car = new Car();
            car.start();
        }
    }


