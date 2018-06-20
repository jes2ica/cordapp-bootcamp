package java_bootcamp;

import com.google.common.collect.ImmutableList;
import java.util.List;
import net.corda.core.contracts.ContractState;
import net.corda.core.identity.AbstractParty;
import net.corda.core.identity.Party;
import org.jetbrains.annotations.NotNull;

public class ShareState implements ContractState {
    private String identifier;
    private Party owner;
    private int purchasePrice;
    private Party issuer;

    public ShareState(String identifier, Party owner, int purchasePrice, Party issuer) {
        this.identifier = identifier;
        this.owner = owner;
        this.purchasePrice = purchasePrice;
        this.issuer = issuer;
    }

    @NotNull
    @Override
    public List<AbstractParty> getParticipants() {
        return ImmutableList.of(owner);
    }

    public String getIdentifier() { return identifier; }

    public Party getOwner() { return owner; }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public Party getIssuer() {
        return issuer;
    }
}
