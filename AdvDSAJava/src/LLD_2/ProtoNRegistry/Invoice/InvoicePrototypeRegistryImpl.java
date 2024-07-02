package LLD_2.ProtoNRegistry.Invoice;

import java.util.HashMap;

public class InvoicePrototypeRegistryImpl implements InvoicePrototypeRegistry {

    HashMap<InvoiceType,Invoice> invoiceMap;

    public InvoicePrototypeRegistryImpl() {
        invoiceMap = new HashMap<>();
    }

    @Override
    public void addPrototype(Invoice user) {
        invoiceMap.put(user.getType(), user);
    }

    @Override
    public Invoice getPrototype(InvoiceType type) {
        return invoiceMap.get(type);
    }

    @Override
    public Invoice clone(InvoiceType type) {
        return invoiceMap.get(type).cloneObject();
    }
}
