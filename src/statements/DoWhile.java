package statements;

import tokens.Token;
import tree.Statements;

public class DoWhile extends Statement {
	public Statements repeat;
	public Token[] condtokens;

	public DoWhile(Statements repeat, Token[] condtkns) {
		super(Statement_TYPE.DO_WHILE);
	}
}