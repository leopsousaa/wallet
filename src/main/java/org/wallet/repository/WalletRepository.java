package org.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wallet.entity.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
}
