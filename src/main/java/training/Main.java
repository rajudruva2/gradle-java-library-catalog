package training;
import java.util.List;
public class Main {
 record Book(String title,String author,boolean available){}
 public static void main(String[] args){
  List.of(new Book("Platform Engineering","A. Dev",true),new Book("Kubernetes Basics","K. Cloud",false)).forEach(b->System.out.printf("%s | %s | %s%n",b.title(),b.author(),b.available()?"Available":"Checked out"));
 }
}
