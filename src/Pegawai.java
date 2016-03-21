public class Pegawai {
    int nik;
    double gajiPokok,tunjangan,bonus,denda;
    String nama;
    int []nik1={101,102,103,104,105,106,107,108,109,110};
    String []nama1={"paijo","lala","lulu","sabar","sule",
                    "paiman","poinimin","sutiman","raja","hari"};
    double[]gajip ={2000,1750,2150,1500,2500,1500,2000,1500,1000,2250};
    double[]tun={1000,900,1000,750,850,350,1000,1250,1000,1000};
    double[]bonuss={500,500,300,600,500,450,500,500,500,200};
    double[]dendaa={200,200,375,200,300,250,200,300,200,200};
    
    public Pegawai(){
        for(int i=0;i<10;i++){
            System.out.println("nik :"+nik1[i]);
            System.out.println("nama :"+nama1[i]);
            System.out.println("gaji pokok :"+gajip[i]);
            System.out.println("tunjangan :"+tun[i]);
            System.out.println("bonus :"+bonuss[i]);
            System.out.println("denda :"+dendaa[i]);
            System.out.println("=============");
        }
    }
        public Pegawai(int id){
            for(int i=0;i<10;i++){
            if(id==nik1[i]){
                System.out.println("nik :"+nik1[i]);
                System.out.println("nama :"+nama1[i]);
                System.out.println("gaji pokok :"+gajip[i]);
                System.out.println("tunjangan :"+tun[i]);
                System.out.println("bonus :"+bonuss[i]);
                System.out.println("denda :"+dendaa[i]);
            }
                }    
            }
        public Pegawai(String a,double b){
            for(int i=0;i<10;i++){
                if(a.equals("gaji") && b==gajip[i]){
                System.out.println("nik :"+nik1[i]);
                System.out.println("nama :"+nama1[i]);
                System.out.println("gaji pokok :"+gajip[i]);
                System.out.println("tunjangan :"+tun[i]);
                System.out.println("bonus :"+bonuss[i]);
                System.out.println("denda :"+dendaa[i]);
                    System.out.println("=============");   
                }
            }
           }
              public Pegawai(String c, String d,double e){
                  for(int i=0;i<10;i++){
                      for(int j=0;j<10;j++){
                  
                  if(c.equals("tunjangan")&& d.equals("<=")&&e==tun[i]){
                while(tun[j]<=tun[i]){  
                System.out.println("nik :"+nik1[j]);
                System.out.println("nama :"+nama1[j]);
                System.out.println("gaji pokok :"+gajip[j]);
                System.out.println("tunjangan :"+tun[j]);
                System.out.println("bonus :"+bonuss[j]);
                System.out.println("denda :"+dendaa[j]);
                System.out.println("=============");break;
                }
                      }
                    }
              }
            }    
              public Pegawai (String bo,char op, double bon){
                  for(int i=0;i<10;i++){
                      for(int j=0;j<10;j++){
                      if(bo.equals("bonus") && op=='>' && bon==bonuss[i]){
                while(bonuss[j]>bonuss[i]){          
                System.out.println("nik :"+nik1[j]);
                System.out.println("nama :"+nama1[j]);
                System.out.println("gaji pokok :"+gajip[j]);
                System.out.println("tunjangan :"+tun[j]);
                System.out.println("bonus :"+bonuss[j]);
                System.out.println("denda :"+dendaa[j]);
                    System.out.println("=============");  break;  
                      }
                     }
                  }
                 }
              }   
    }


            