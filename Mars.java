import java.util.Scanner;
import java.io.*;

class Mars{
    String dir = "N";
    int x = 0;
    int y = 0;
    String directions[] = {"N", "E", "S", "W"};

    public String getDir(){
        return this.dir;
    }
    public String getX(){
        return Integer.toString(this.x);
    }
    public String getY(){
        return Integer.toString(this.y);
    }

    public void moveForward(){
        if(dir.equals("N")){
            y++;
        }else if(dir.equals("S")){
            y--;
        }else if(dir.equals("E")){
            x++;
        }else if(dir.equals("W")){
            x--;
        }
    }

    public void rotate(String c){
        if(dir.equals("N")){
            dir = (c.equals('L')) ? "W" : "E";
        }else if(dir.equals("S")){
            dir = (c.equals("L")) ? "E" : "W";
        }else if(dir.equals("E")){
            dir = (c.equals("L")) ? "N" : "S";
        }else if(dir.equals("W")){
            dir = (c.equals("L")) ? "S" : "N";
        }
    }

    public void evalChar(String c){
        if(c.equals("L") || c.equals("R")){
            rotate(c);
        }else if(c.equals("M")){
            moveForward();
        }
    }

    public void evalLine(String line){
        for(int i = 0; i < line.length(); i++){
            evalChar(line.substring(i, i+1));
        }
    }
}
