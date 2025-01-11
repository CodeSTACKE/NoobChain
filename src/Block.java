import java.util.Date;


public class Block {
    public String hash;
    private String data;
    public String prevHash;
    private long timeStamp;
    private int nonce;

    public Block( String data, String prevHash) {
        this.data = data;
        this.prevHash = prevHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();

    }
    public String calculateHash() {
        String calulatedhash = StringUtil.applySha256(
                prevHash + data + Long.toString(timeStamp) + Integer.toString(nonce));
        return calulatedhash;
    }
    public void mineBlock(int difficulty) {
        String target= new String(new char[difficulty]).replace('\0', '0');
        while(!hash.substring(0, difficulty).equals(target)) {
            nonce ++;
            hash=calculateHash();
        }
        System.out.println("Blocked Mined : : " + hash);
    }
}
