package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {

//    String kinds;
//    int hp;
//
//    public void setName(String name) {
//
//        this.name = name;
//
//    }
//
//    public void setHp(int hp) {
//
//        if(hp > 0) {
//            this.hp = hp;
//        } else {
//            this.hp = 0;
//        }



        String kind;
        int hp;

        public void setName(String name) {

            this.kind = name;

        }

        public void setHp(int hp) {

            if(hp > 0) {
                this.hp = hp;
            } else {
                this.hp = 0;
            }

        }

        public String getInfo() {

            return "몬스터의 종류는" + this.kind + "이고, 체력은 " + this.hp + "입니다";

        }
}

