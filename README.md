[] Creating  your first (very) basic ‘blockchain’

[] Implement a simple proof of work ( mining ) system.

[] Marvel at the possibilities.

[] Java Language used to create the program 

[] External GSON Libary used ,  This will allow us to turn an object into JSON


output 
------
Trying to Mine Block 1 ...
Blocked Mined : : 000002bddf25029fbbdaf52df2a8cb6e944aab1759af6d3313b98c88ba461bf1
Trying to Mine Block 2 ...
Blocked Mined : : 00000bf0d3bfae0b5f77246066823970e574a20ac6ac0b54e7de29a6d48c6b85
Trying to Mine Block 3...
Blocked Mined : : 0000040b0f6bdf310300e2e7a29a030212fb8b3b16a73fb3aa25102626b52cb3

 BlockChain is valid :true

 The block Chain: 
[
  {
    "hash": "000002bddf25029fbbdaf52df2a8cb6e944aab1759af6d3313b98c88ba461bf1",
    "data": "Hi im the first Block ",
    "prevHash": "0",
    "timeStamp": 1736575501396,
    "nonce": 3711602
  },
  {
    "hash": "00000bf0d3bfae0b5f77246066823970e574a20ac6ac0b54e7de29a6d48c6b85",
    "data": "Yo im the Second Block ",
    "prevHash": "000002bddf25029fbbdaf52df2a8cb6e944aab1759af6d3313b98c88ba461bf1",
    "timeStamp": 1736575506150,
    "nonce": 195939
  },
  {
    "hash": "0000040b0f6bdf310300e2e7a29a030212fb8b3b16a73fb3aa25102626b52cb3",
    "data": "Hey im the third  Block ",
    "prevHash": "00000bf0d3bfae0b5f77246066823970e574a20ac6ac0b54e7de29a6d48c6b85",
    "timeStamp": 1736575506528,
    "nonce": 3167686
  }
]
