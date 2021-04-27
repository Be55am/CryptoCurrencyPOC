package tech.bessamsahli.blockchain;

/**
 * @author bessam on 27/04/2021
 */

public class TransactionInput {

	public String transactionOutputId; //Reference to TransactionOutputs -> transactionId
	public TransactionOutput UTXO; //Contains the Unspent transaction output

	public TransactionInput(String transactionOutputId) {
		this.transactionOutputId = transactionOutputId;
	}
}
