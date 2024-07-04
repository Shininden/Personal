package POO.Guanabara.Aula9;

public class Livro implements Publicacao
{
    private String title;
    private String author;
    private int totPages;
    private int currentPage;
    private boolean isOpen;
    private Pessoa reader;

    public Livro(String title, String author, int totPages, Pessoa reader) 
    {
        this.title = title;
        this.author = author;
        this.totPages = totPages;
        this.currentPage = 0;
        this.isOpen = false;
        this.reader = reader;
    }
    
    public String details()
    {
        return "Book {" + " title = " + title + ", \nauthor = "
                + author + ", \ntotPages = " + totPages
                + ", \ncurrentPage = " + currentPage + ", \nis open = "
                + isOpen + ", \nreader = " + reader.getName() + 
                "\nreader's age = " + reader.getAge() + 
                 "\nreader's gender = " + reader.getGender() + " }";
    }

    @Override
    public void open() {
       setOpen(true);
    }

    @Override
    public void close() {
        setOpen(false);
    }

    @Override
    public void skimOver(int amountOfpages) 
    {
        if(amountOfpages > getTotPages())
            setCurrentPage(0);
            
        else
            setCurrentPage(amountOfpages);  
    }

    @Override
    public void nextPage() {
        setCurrentPage(getCurrentPage() + 1);
    }

    @Override
    public void previousPage() {
        setCurrentPage(getCurrentPage() - 1);
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotPages() {
        return totPages;
    }
    public void setTotPages(int totPages) {
        this.totPages = totPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isOpen() {
        return isOpen;
    }
    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Pessoa getReader() {
        return reader;
    }
    public void setReader(Pessoa reader) {
        this.reader = reader;
    }
    
}