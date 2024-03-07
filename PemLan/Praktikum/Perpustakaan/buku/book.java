package buku;
public class book {

    public String[][] teknologi = {
        {"The Master Algorithm", "Pedro Domingos", "2015"},
        {"Data Science for Business", "Foster Provost", "2013"},
        {"Thinking, Fast and Slow", "Daniel Kahneman", "2011"},
        {"The Second Machine Age", "Erik B", "2014"},
        {"Weapons of Math Destruction", "Catchy O'Neil", "2016"}
    };

    public String[][] filsafat = {
        {"Critique of Pure Reason", "Immanuel Kant", "1781"},
        {"Being and Nothingness", "Jean-Paul Sartre", "1943"},
        {"Meditations on First Philosophy", "René Descartes", "1641"},
        {"Beyond Good and Evil", "Friedrich Nietzsche", "1886"},
        {"The Phenomenology of Spirit", "Georg Wilhelm Friedrich Hegel", "1807"}
    };

    public String[][] sejarah = {
        {"A People's History of the United States", "Howard Zinn", "1980"},
        {"SPQR: A History of Ancient Rome", "Mary Beard", "2015"},
        {"1491: New Revelations of the Americas Before Columbus", "Charles C", "2005"},
        {"The Rise and Fall of the Third Reich", "William L. Shirer", "1960"},
        {"Guns, Germs, and Steel", "Jared Diamond", "1997"}
    };

    public String[][] agama = {
        {"Sunnah: The Way of the Prophet Muhammad", "Muhammad Saed Abdul-Rahman", "2007"},
        {"In the Footsteps of the Prophet", "Tariq Ramadan", "2007"},
        {"Muhammad: His Life Based on the Earliest Sources", "Martin Lings", "1983"},
        {"Islam: A Short History", "Karen Armstrong", "2000"},
        {"The History of Islam", " Akbar Shah Najeebabadi", "2000"}
    };

    public String[][] psikologi = {
        {"Mindset: The New Psychology of Success", "Carol S. Dweck", "2006"},
        {"Emotional Intelligence: Why It Can Matter More Than IQ", "Daniel Goleman", "1995"},
        {"The Interpretation of Dreams", "Sigmund Freud", "1899"},
        {"The Psychology Book", "DK Publishing", "2012"},
        {"The Happiness Hypothesis: Finding Modern Truth in Ancient Wisdom", "Jonathan Haidt", "2006"}
    };

    public String[][] politik = {
        {"On Liberty", "John Stuart Mill", "1859"},
        {"Capital in the Twenty-First Century", "Thomas Piketty", "2013"},
        {"Democracy in America", "Alexis de Tocqueville", "1835"},
        {"The Clash of Civilizations and the Remaking of World Order", "Samuel P. Huntington", "1996"},
        {"The Communist Manifesto", "Karl Marx", "1848"}
    };

    public String[][] fiksi = {
        {"To Kill a Mockingbird", "Harper Lee", "1960"},
        {"The Hobbit", "J.R.R. Tolkien", "1937"},
        {"The Great Gatsby", "F. Scott Fitzgerald", "1925"},
        {"Harry Potter and the Philosopher's Stone", "J.K. Rowling", "1997"},
        {"The Da Vinci Code", "Dan Brown", "2003"}
    };
    
public String getInformasiBuku(int kode) {
    String informasi = "";
    
    switch (kode) {
        case 1:
            informasi = "\nKategori\t: Teknologi\n";
            informasi += "========================\n";
            for (String[] buku : teknologi) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        case 2:
            informasi = "Kategori: Filsafat\n";
            informasi += "========================\n";
            for (String[] buku : filsafat) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        case 3:
            informasi = "Kategori\t: Sejarah\n";
            informasi += "========================\n";
            for (String[] buku : sejarah) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        case 4:
            informasi = "Kategori\t: Agama\n";
            informasi += "========================\n";
            for (String[] buku : agama) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        case 5:
            informasi = "Kategori\t: Psikologi\n";
            informasi += "========================\n";
            for (String[] buku : psikologi) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        case 6:
            informasi = "Kategori: Politik\n";
            informasi += "========================\n";
            for (String[] buku : politik) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        case 7:
            informasi = "Kategori\t: Fiksi\n";
            informasi += "========================\n";
            for (String[] buku : fiksi) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        default:
            informasi = "Kode buku tidak valid.";
            break;
    }  
    return informasi;
}
}