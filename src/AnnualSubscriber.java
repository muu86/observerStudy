public class AnnualSubscriber implements Observer {
    private String newString;
    private Publisher publisher;

    public AnnualSubscriber(Publisher publisher) {
        this.publisher = publisher;
        publisher.add(this);
    }

    @Override
    public void update(String title, String news) {
        this.newString = title + "\n-------------------------------\n" + news;
        display();
    }

    private void display() {
        System.out.println("\n\n오늘의 뉴스 \n===================\n\n");
    }
}
