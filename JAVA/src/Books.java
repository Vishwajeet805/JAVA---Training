class Book {
    void Read(){
        System.out.println("Reading a Book");
    }
}
class Novel extends Book{
    void StoryLine(){
        System.out.println("Novel is Interesting");
    }
}
class BOOK{
    static void main() {
        Novel m=new Novel();
        m.Read();
        m.StoryLine();
    }
}