package io.turntabl.game;

import io.turntabl.dealer.Dealer;
import io.turntabl.gameTable.GameTable;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GameTest {
    @Mock
    private GameTable gameTable;
    @Mock
    private Dealer dealer;

    @Test
    void resetGame() {
    }
}