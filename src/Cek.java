public class Tim {
    private String nama;
    private Arraylist <Member> m = new ArrayList<>();
    
    public String getNama() {
        return nama;
        
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setMember(Member member) {
        m.add(member);  
    }
    
    public void displayfULLMember() {
        for (Member member : m) {
            if(!(member instanceof Trainee)) {
                if (member != null){
            member.display();        
                }
            }
        }
    }
    public void displayTrainee(){
        for (Member trainee : m) {
            if(trainee instanceof Trainee) {
                trainee.display();
            }
        }
    }    
        
    }