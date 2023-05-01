#consists blocs
# blocs consist transaction
# blocks are connected through hashing
 # unique digital fingerprint - transaction + previous blocks hash

from Block import Block
blockchain = []

genesis_block = Block("Chancellor on the brink...", ["Satoshi sent 1BTC to juan",
                                                     "Maria sent 5 BTC to Jenny",
                                                     "Satoshi sent 5 BTC to Hal Finney"])

second_block = Block(genesis_block.block_hash, ["juan sent % BTC toLiz"])
third_block = Block(second_block.block_hash, ["A to C 5 BTC", "G to D 4 BTC"])

print("Block hash: Genesis Block")
print(genesis_block.block_hash)