import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 標準入力によりジャンケンの手をユーザに聞く戦略クラス。
 */
public class AskTactics implements Tactics {
    /**
     * 戦略を読み、ジャンケンの手を得る。
     * グー・チョキ・パーのいずれかをPlayerクラスに定義された
     * 以下の定数で返す。
     * Player.STONE       - グー
     * Player.SCISSORS    - チョキ
     * Player.PAPER       - パー
     *
     * @return ジャンケンの手
     */
    public int readTactics() {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nジャンケンの手を入力してください。");
        System.out.println("0: グー");
        System.out.println("1: チョキ");
        System.out.println("2: パー");
        System.out.print("? ");

        // ジャンケンの手
        int hand = 0;

        while (true) {
            try {
                // 入力を受け取り
                String inputStr = br.readLine();

                // 入力文字列を数値に変換する。
                hand = Integer.parseInt(inputStr);

                // 0〜3のいずれかが入力されたらループを抜ける
                if ( hand == Player.STONE
                        || hand == Player.SCISSORS
                        || hand == Player.PAPER) {
                    break;
                        }
                else {
                    System.out.println("入力が正しくありません。再度入力してください。");
                }

            } catch (Exception ex) {
                System.out.println("入力が正しくありません。再度入力してください。");
                System.out.println("? ");
            }

        }

        return hand;
    }
}
