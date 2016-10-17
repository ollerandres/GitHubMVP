package com.andevcba.githubmvp.domain.interactor;

import com.andevcba.githubmvp.data.repository.ReposCallback;

/**
 * Base interactor.
 *
 * @author lucas.nobile
 */
public interface Interactor {

    void execute(ReposCallback callback);
}
