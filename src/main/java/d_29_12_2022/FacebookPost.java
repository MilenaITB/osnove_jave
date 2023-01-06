package d_29_12_2022;

//.Kreirati klasu FacebookPost koja ima:
//   Od atributa:
//ime i prezime korisnika koji je objavio post
//ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku
// mozete da postavite objavu na tudjem profilu)
//tekst objave
//broj lajkova
//broj deljenja
//gettere za sve atribute
//settere za sve atribute osim broja lajkova i broja deljenja
//  Od metoda:
//like(), koja povecava broj lajkova za 1.
//dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//share(), koja povecava broj deljenja za 1
//print(), koja stampa objavu u formatu:
//(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//(tekst objave)
//Likes (broj lajkova) | Shares (broj deljenja)

public class FacebookPost {

        private String name;
        private String frendName;
        private String text;
        private int likeCount;
        private int shareCount;

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getFrendName(){
            return frendName;
        }

        public void setFrendName(String frendName){
            this.frendName = frendName;
        }

        public String getText(){
            return text;
        }

        public void setText(String text){
            this.text = text;
        }

        public int getLikeCount(){
            return likeCount;
        }

        public void setLikeCount(int likeCount){
            this.likeCount = likeCount;
        }

        public int getShareCount(){
            return shareCount;
        }

        public void setShareCount(int shareCount){
            this.shareCount = shareCount;
        }


        // metode:
        public void like(){
            likeCount++;
        }

        public void dislike(){
            if (likeCount > 0){
                likeCount--;
            }
        }

        public void share(){
            shareCount++;
        }
//         print(), koja stampa objavu u formatu:
//         (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//         (tekst objave)
//         Likes (broj lajkova) | Shares (broj deljenja)

        public void print(){
            System.out.println(name + ">>>" + frendName);
            System.out.println(text);
            System.out.println("Likes " + likeCount + " | Shares " + shareCount);
        }

    }