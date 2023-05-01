import hashlib

class Block:
    def __init__(self, previous_hash, transaction):
       self.transactions = transaction
       self.previous_hash = previous_hash
       string_to_hash= "".join(transaction) + previous_hash
       self.block_hash = hashlib