package org.wallet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wallet.entity.Wallet;
import org.wallet.repository.WalletRepository;
import org.wallet.service.WalletService;

@Service
public class WalletServiceImpl implements WalletService {

    @Autowired
    private WalletRepository repository;

    @Override
    public Wallet save(Wallet w) {
        return repository.save(w);
    }

}
