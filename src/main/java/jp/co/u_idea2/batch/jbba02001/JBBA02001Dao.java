package jp.co.u_idea2.batch.jbba02001;

import jp.co.u_idea2.batch.jbba00.FlightDto;

import java.util.Date;
import java.util.List;

/**
 * フライト情報退避ジョブで使用するDAOインターフェース。
 * 
 * @author NTT 電電太郎
 */
public interface JBBA02001Dao {

    /**
     * 不要フライト情報を取得する。
     * 
     * @param object パラメータ
     */
    List<FlightDto> findFlightList(Date date);

    /**
     * 不要予約フライト情報を取得する。
     * 
     * @param object パラメータ
     */
    List<ReserveFlightDto> findReserveFlightList(Date date);

    /**
     * 不要搭乗者情報を取得する。
     * 
     * @param object パラメータ
     */
    List<PassengerDto> findPassengerList(Date date);

    /**
     * 不要フライト情報を削除する。
     * 
     * @param date 削除条件の退避処理日時
     * @return 削除件数
     */
    int deleteFlight(Date date);

    /**
     * 不要予約フライト情報を削除する。
     * 
     * @param date 削除条件の退避処理日時
     * @return 削除件数
     */
    int deleteReserveFlight(Date date);

    /**
     * 不要搭乗者情報を削除する。
     * 
     * @param date 削除条件の退避処理日時
     * @return 削除件数
     */
    int deletePassenger(Date date);

}
