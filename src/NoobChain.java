import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class NoobChain {
    public static ArrayList<Block> blockchain =new ArrayList<>();
    public static int difficulty= 5;

    public static void main(String[] args) {
    blockchain.add(new Block("Hi im the first Block ","0"));
    System.out.println("Trying to Mine Block 1 ...");
    blockchain.get(0).mineBlock(difficulty);

    blockchain.add(new Block("Yo im the Second Block ",blockchain.get(blockchain.size()-1).hash));
    System.out.println("Trying to Mine Block 2 ...");
    blockchain.get(1).mineBlock(difficulty);

    blockchain.add(new Block("Hey im the third  Block ",blockchain.get(blockchain.size()-1).hash));
    System.out.println("Trying to Mine Block 3...");
    blockchain.get(2).mineBlock(difficulty);

    System.out.println("\n BlockChain is valid :" + isChainValid());

    String blockchainJason = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
    System.out.println("\n The block Chain: ");
    System.out.println(blockchainJason);
    }
    public static Boolean isChainValid() {
        Block currentBlock;
        Block previousBlock;
        String hashTarget = new String(new char[difficulty]).replace('\0', '0');

//        loop through blockchain to check hashes
        for (int i = 1; i < blockchain.size(); i++) {
            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i-1);
//        compare registered hash and calculated hash
             if(!currentBlock.hash.equals(currentBlock.calculateHash())) {
                 System.out.println("Hash does not match");
                 return false;
             }
//             compare previous hash and registered previous hash
            if(!previousBlock.hash.equals(currentBlock.prevHash)) {
                System.out.println("Previous Hashes not equal");
                return false;
            }
//            check if hash is solved
            if(!currentBlock.hash.substring(0, difficulty).equals(hashTarget)) {
                System.out.println("This block hasn't been mined");
                return  false;
            }


        }
        return true;
    }
}