package Lesson_06;

public class MayGatDapLienHop {
    public void gatLua(String cayLua){
        System.out.println("Gat lua" + cayLua);
    }

    public void xayLua(String hatLua){
        System.out.println("Xay lua"+ hatLua);
    }

    public static void main(String[] args) {
        MayGatDapLienHop mayGatDapLienHop = new MayGatDapLienHop();
        mayGatDapLienHop.gatLua("Cay lua");
        mayGatDapLienHop.xayLua("Hat Lua");
    }
}
