package com.notdefteri.state;

import com.notdefteri.model.Not;

public class OkunmusNot implements NotState {
    @Override
    public void oku(Not not) {
        // Zaten okunmuş durumda
    }

    @Override
    public void duzenle(Not not, String yeniBaslik, String yeniIcerik) {
        not.setBaslik(yeniBaslik);
        not.setIcerik(yeniIcerik);
        not.setState(new DuzenlenmisNot());
    }

    @Override
    public void sil(Not not) {
        not.setState(new SilinmisNot());
    }
}
