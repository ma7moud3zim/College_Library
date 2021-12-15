
package bookestore;

import static bookestore.connection.con;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {
    Boolean fBook = false , fAuthor = false, fPublisher = false, fSearch= false;
    
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Menu() {
        this.setBounds(200,200,994, 571);
        this.setUndecorated(true);
        this.setTitle("E-Book Store");
        initComponents();
        this.setResizable(false);
        setIcon();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        Home = new javax.swing.JPanel();
        MainPage = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BooksPanel = new javax.swing.JPanel();
        ISBNtext = new javax.swing.JTextField();
        Titletext = new javax.swing.JTextField();
        Pricetext = new javax.swing.JTextField();
        Pagestext = new javax.swing.JTextField();
        P_Code = new javax.swing.JTextField();
        Typetext = new javax.swing.JTextField();
        Inserting = new javax.swing.JButton();
        Deleting = new javax.swing.JButton();
        Updating = new javax.swing.JButton();
        Showing = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TBook = new javax.swing.JTable();
        AuthorPanel = new javax.swing.JPanel();
        AuthorID = new javax.swing.JTextField();
        Fname = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        InsertingA = new javax.swing.JButton();
        DeletingA = new javax.swing.JButton();
        UpdatingA = new javax.swing.JButton();
        ShowingA = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tauthor = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        Trelation = new javax.swing.JTable();
        BISBN = new javax.swing.JTextField();
        relationID = new javax.swing.JTextField();
        InsertingA1 = new javax.swing.JButton();
        DeletingA1 = new javax.swing.JButton();
        UpdatingA1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        PublisherPanel = new javax.swing.JPanel();
        PCode = new javax.swing.JTextField();
        Pcity = new javax.swing.JTextField();
        Pnametext = new javax.swing.JTextField();
        Pphone = new javax.swing.JTextField();
        InsertingP = new javax.swing.JButton();
        UpdatingP = new javax.swing.JButton();
        DeletingP = new javax.swing.JButton();
        ShowingP = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TPublisher = new javax.swing.JTable();
        SearchPanel = new javax.swing.JPanel();
        Searching = new javax.swing.JLabel();
        Sisbn = new javax.swing.JTextField();
        SearchingISBN = new javax.swing.JButton();
        Searchingn = new javax.swing.JLabel();
        sName = new javax.swing.JTextField();
        SearchingName = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        Tsearch = new javax.swing.JTable();
        Menu = new javax.swing.JPanel();
        Book = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        Author = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        Publisher = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        SearchAbtBook = new java.awt.Panel();
        jLabel4 = new javax.swing.JLabel();
        Exit = new java.awt.Panel();
        ExitLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Home.setBackground(new java.awt.Color(0, 204, 204));
        Home.setMaximumSize(new java.awt.Dimension(750, 470));
        Home.setMinimumSize(new java.awt.Dimension(750, 470));
        Home.setPreferredSize(new java.awt.Dimension(750, 470));

        MainPage.setBackground(new java.awt.Color(102, 153, 255));

        jLabel5.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Welcoem to your E-book Store! ");

        jLabel7.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Click on a tab to make an action");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookestore/23721067.png"))); // NOI18N

        javax.swing.GroupLayout MainPageLayout = new javax.swing.GroupLayout(MainPage);
        MainPage.setLayout(MainPageLayout);
        MainPageLayout.setHorizontalGroup(
            MainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(MainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        MainPageLayout.setVerticalGroup(
            MainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPageLayout.createSequentialGroup()
                .addGroup(MainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPageLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPageLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(175, Short.MAX_VALUE))
        );

        BooksPanel.setBackground(new java.awt.Color(51, 153, 255));
        BooksPanel.setForeground(new java.awt.Color(255, 255, 255));
        BooksPanel.setMaximumSize(new java.awt.Dimension(750, 550));
        BooksPanel.setMinimumSize(new java.awt.Dimension(750, 550));

        ISBNtext.setText("ISBN");
        ISBNtext.setToolTipText("");
        ISBNtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISBNtextActionPerformed(evt);
            }
        });

        Titletext.setText("Title");
        Titletext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitletextActionPerformed(evt);
            }
        });

        Pricetext.setText("Price");
        Pricetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PricetextActionPerformed(evt);
            }
        });

        Pagestext.setText("Pages");
        Pagestext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagestextActionPerformed(evt);
            }
        });

        P_Code.setText("Publisher Code");
        P_Code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_CodeActionPerformed(evt);
            }
        });

        Typetext.setText("Type");
        Typetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypetextActionPerformed(evt);
            }
        });

        Inserting.setText("Insert");
        Inserting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertingMouseClicked(evt);
            }
        });
        Inserting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertingActionPerformed(evt);
            }
        });

        Deleting.setText("Delete");
        Deleting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletingActionPerformed(evt);
            }
        });

        Updating.setText("Updating");
        Updating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatingActionPerformed(evt);
            }
        });

        Showing.setText("Show Books");
        Showing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowingActionPerformed(evt);
            }
        });

        TBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ISPN", "Title", "Price", "Pages", "Type", "Publisher"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TBook);

        javax.swing.GroupLayout BooksPanelLayout = new javax.swing.GroupLayout(BooksPanel);
        BooksPanel.setLayout(BooksPanelLayout);
        BooksPanelLayout.setHorizontalGroup(
            BooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BooksPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(BooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BooksPanelLayout.createSequentialGroup()
                            .addComponent(ISBNtext, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Titletext, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(Pricetext, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Pagestext, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Typetext, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(BooksPanelLayout.createSequentialGroup()
                            .addGroup(BooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Showing, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(P_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(218, 218, 218)
                            .addComponent(Inserting, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Deleting, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Updating, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        BooksPanelLayout.setVerticalGroup(
            BooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BooksPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(BooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ISBNtext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titletext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pricetext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pagestext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Typetext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Updating, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deleting, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inserting, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Showing, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AuthorPanel.setBackground(new java.awt.Color(51, 153, 255));

        AuthorID.setText("AuthorID");
        AuthorID.setToolTipText("");
        AuthorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorIDActionPerformed(evt);
            }
        });

        Fname.setText("First Name");
        Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameActionPerformed(evt);
            }
        });

        Lname.setText("Last Name");
        Lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnameActionPerformed(evt);
            }
        });

        InsertingA.setText("Insert");
        InsertingA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertingAMouseClicked(evt);
            }
        });
        InsertingA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertingAActionPerformed(evt);
            }
        });

        DeletingA.setText("Delete");
        DeletingA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletingAActionPerformed(evt);
            }
        });

        UpdatingA.setText("Updating");
        UpdatingA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatingAActionPerformed(evt);
            }
        });

        ShowingA.setBackground(new java.awt.Color(0, 0, 0));
        ShowingA.setForeground(new java.awt.Color(255, 255, 255));
        ShowingA.setText("Show Authors and Books");
        ShowingA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowingAActionPerformed(evt);
            }
        });

        Tauthor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "AuthorID", "First Name", "Last Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tauthor);

        Trelation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "BookID", "AuthorID"
            }
        ));
        jScrollPane4.setViewportView(Trelation);

        BISBN.setText("Book ISBN ");
        BISBN.setToolTipText("");
        BISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BISBNActionPerformed(evt);
            }
        });

        relationID.setText("Author ID");
        relationID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relationIDActionPerformed(evt);
            }
        });

        InsertingA1.setText("Insert");
        InsertingA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertingA1MouseClicked(evt);
            }
        });
        InsertingA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertingA1ActionPerformed(evt);
            }
        });

        DeletingA1.setText("Delete");
        DeletingA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletingA1ActionPerformed(evt);
            }
        });

        UpdatingA1.setText("Updating");
        UpdatingA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatingA1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Eras Demi ITC", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Add Author to book");

        javax.swing.GroupLayout AuthorPanelLayout = new javax.swing.GroupLayout(AuthorPanel);
        AuthorPanel.setLayout(AuthorPanelLayout);
        AuthorPanelLayout.setHorizontalGroup(
            AuthorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AuthorPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(AuthorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AuthorPanelLayout.createSequentialGroup()
                        .addComponent(ShowingA, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AuthorPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(47, 47, 47))))
            .addGroup(AuthorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AuthorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AuthorPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(BISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(relationID, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InsertingA1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeletingA1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdatingA1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AuthorPanelLayout.createSequentialGroup()
                        .addComponent(AuthorID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InsertingA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeletingA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UpdatingA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        AuthorPanelLayout.setVerticalGroup(
            AuthorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AuthorPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(AuthorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AuthorID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InsertingA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeletingA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdatingA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(AuthorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(relationID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InsertingA1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeletingA1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdatingA1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ShowingA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AuthorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );

        PublisherPanel.setBackground(new java.awt.Color(51, 153, 255));

        PCode.setText("Code");
        PCode.setToolTipText("");
        PCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCodeActionPerformed(evt);
            }
        });

        Pcity.setText("City");
        Pcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PcityActionPerformed(evt);
            }
        });

        Pnametext.setText("Name");
        Pnametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PnametextActionPerformed(evt);
            }
        });

        Pphone.setText("Phone");
        Pphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PphoneActionPerformed(evt);
            }
        });

        InsertingP.setText("Insert");
        InsertingP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertingPMouseClicked(evt);
            }
        });
        InsertingP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertingPActionPerformed(evt);
            }
        });

        UpdatingP.setText("Update");
        UpdatingP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatingPActionPerformed(evt);
            }
        });

        DeletingP.setText("Delete");
        DeletingP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletingPActionPerformed(evt);
            }
        });

        ShowingP.setBackground(new java.awt.Color(0, 0, 0));
        ShowingP.setForeground(new java.awt.Color(255, 255, 255));
        ShowingP.setText("Show Publishers");
        ShowingP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowingPActionPerformed(evt);
            }
        });

        TPublisher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Code", "Name", "City", "Phone"
            }
        ));
        jScrollPane5.setViewportView(TPublisher);

        javax.swing.GroupLayout PublisherPanelLayout = new javax.swing.GroupLayout(PublisherPanel);
        PublisherPanel.setLayout(PublisherPanelLayout);
        PublisherPanelLayout.setHorizontalGroup(
            PublisherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PublisherPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(PublisherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PublisherPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(PublisherPanelLayout.createSequentialGroup()
                        .addComponent(ShowingP, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InsertingP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(DeletingP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UpdatingP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))))
            .addGroup(PublisherPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(PCode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pnametext, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pcity, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Pphone, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PublisherPanelLayout.setVerticalGroup(
            PublisherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PublisherPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PublisherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pnametext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pcity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pphone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PublisherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertingP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeletingP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdatingP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowingP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        SearchPanel.setBackground(new java.awt.Color(51, 153, 255));

        Searching.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 18)); // NOI18N
        Searching.setForeground(new java.awt.Color(255, 255, 255));
        Searching.setText("Search by ISPN");

        Sisbn.setText("ISBN");
        Sisbn.setToolTipText("");
        Sisbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SisbnActionPerformed(evt);
            }
        });

        SearchingISBN.setText("Search");
        SearchingISBN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchingISBNMouseClicked(evt);
            }
        });
        SearchingISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchingISBNActionPerformed(evt);
            }
        });

        Searchingn.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 18)); // NOI18N
        Searchingn.setForeground(new java.awt.Color(255, 255, 255));
        Searchingn.setText("Search by Title");

        sName.setText("Title");
        sName.setToolTipText("");
        sName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sNameActionPerformed(evt);
            }
        });

        SearchingName.setText("Search");
        SearchingName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchingNameMouseClicked(evt);
            }
        });
        SearchingName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchingNameActionPerformed(evt);
            }
        });

        Tsearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ISPN", "Title", "Price", "Pages", "Type", "Publisher"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(Tsearch);

        javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Searching, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(Sisbn)
                    .addComponent(SearchingISBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Searchingn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sName)
                    .addComponent(SearchingName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(190, 190, 190))
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addComponent(Searchingn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchingName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addComponent(Searching, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sisbn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchingISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BooksPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AuthorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PublisherPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(HomeLayout.createSequentialGroup()
                    .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 2, Short.MAX_VALUE)))
            .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MainPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BooksPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AuthorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PublisherPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SearchPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MainPage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Menu.setBackground(new java.awt.Color(0, 102, 204));
        Menu.setMaximumSize(new java.awt.Dimension(242, 569));
        Menu.setMinimumSize(new java.awt.Dimension(242, 569));

        Book.setBackground(new java.awt.Color(204, 204, 204));
        Book.setMaximumSize(new java.awt.Dimension(242, 44));
        Book.setMinimumSize(new java.awt.Dimension(242, 44));
        Book.setPreferredSize(new java.awt.Dimension(242, 44));
        Book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BookMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setText("Books");
        jLabel1.setToolTipText("");
        jLabel1.setAutoscrolls(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout BookLayout = new javax.swing.GroupLayout(Book);
        Book.setLayout(BookLayout);
        BookLayout.setHorizontalGroup(
            BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BookLayout.setVerticalGroup(
            BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BookLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        Author.setBackground(new java.awt.Color(204, 204, 204));
        Author.setMaximumSize(new java.awt.Dimension(242, 44));
        Author.setMinimumSize(new java.awt.Dimension(242, 44));
        Author.setName(""); // NOI18N
        Author.setPreferredSize(new java.awt.Dimension(242, 44));
        Author.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AuthorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AuthorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AuthorMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel2.setText("Author");
        jLabel2.setToolTipText("");
        jLabel2.setAutoscrolls(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout AuthorLayout = new javax.swing.GroupLayout(Author);
        Author.setLayout(AuthorLayout);
        AuthorLayout.setHorizontalGroup(
            AuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AuthorLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AuthorLayout.setVerticalGroup(
            AuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AuthorLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        Publisher.setBackground(new java.awt.Color(204, 204, 204));
        Publisher.setMaximumSize(new java.awt.Dimension(242, 44));
        Publisher.setMinimumSize(new java.awt.Dimension(242, 44));
        Publisher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PublisherMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PublisherMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PublisherMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel3.setText("Publisher");
        jLabel3.setToolTipText("");
        jLabel3.setAutoscrolls(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout PublisherLayout = new javax.swing.GroupLayout(Publisher);
        Publisher.setLayout(PublisherLayout);
        PublisherLayout.setHorizontalGroup(
            PublisherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PublisherLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel3)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        PublisherLayout.setVerticalGroup(
            PublisherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PublisherLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        SearchAbtBook.setBackground(new java.awt.Color(204, 204, 204));
        SearchAbtBook.setMaximumSize(new java.awt.Dimension(242, 44));
        SearchAbtBook.setMinimumSize(new java.awt.Dimension(242, 44));
        SearchAbtBook.setPreferredSize(new java.awt.Dimension(242, 44));
        SearchAbtBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchAbtBookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SearchAbtBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchAbtBookMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setText("Search for book");
        jLabel4.setToolTipText("");
        jLabel4.setAutoscrolls(true);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, SearchAbtBook, org.jdesktop.beansbinding.ObjectProperty.create(), jLabel4, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout SearchAbtBookLayout = new javax.swing.GroupLayout(SearchAbtBook);
        SearchAbtBook.setLayout(SearchAbtBookLayout);
        SearchAbtBookLayout.setHorizontalGroup(
            SearchAbtBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchAbtBookLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(52, 52, 52))
        );
        SearchAbtBookLayout.setVerticalGroup(
            SearchAbtBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchAbtBookLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        Exit.setBackground(new java.awt.Color(204, 204, 204));
        Exit.setMaximumSize(new java.awt.Dimension(242, 44));
        Exit.setMinimumSize(new java.awt.Dimension(242, 44));
        Exit.setPreferredSize(new java.awt.Dimension(242, 44));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
        });

        ExitLabel.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        ExitLabel.setText("Exit and Save");
        ExitLabel.setToolTipText("");
        ExitLabel.setAutoscrolls(true);
        ExitLabel.setMaximumSize(new java.awt.Dimension(242, 44));
        ExitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ExitLayout = new javax.swing.GroupLayout(Exit);
        Exit.setLayout(ExitLayout);
        ExitLayout.setHorizontalGroup(
            ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        ExitLayout.setVerticalGroup(
            ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExitLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(ExitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Book E-Store");
        jLabel6.setToolTipText("");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SearchAbtBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addComponent(Publisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(Book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(Book, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Author, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Publisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(SearchAbtBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookMouseClicked
        BooksPanel.setVisible(true);
        AuthorPanel.setVisible(false);
        PublisherPanel.setVisible(false);
        SearchPanel.setVisible(false);
        MainPage.setVisible(false);
        
        fBook = true; 
        fAuthor = false;
        fPublisher = false;
        fSearch = false;
        Book.setBackground(Color.white);
        Author.setBackground(new Color(204,204,204));
        Publisher.setBackground(new Color(204,204,204));
        SearchAbtBook.setBackground(new Color(204,204,204));
        
        
    }//GEN-LAST:event_BookMouseClicked

    private void AuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AuthorMouseClicked
        BooksPanel.setVisible(false);
        AuthorPanel.setVisible(true);
        PublisherPanel.setVisible(false);
        SearchPanel.setVisible(false);
        MainPage.setVisible(false);

        fBook = false; 
        fAuthor = true;
        fPublisher = false;
        fSearch = false;
        Author.setBackground(Color.white);
        Book.setBackground(new Color(204,204,204));
        Publisher.setBackground(new Color(204,204,204));
        SearchAbtBook.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_AuthorMouseClicked

    private void PublisherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PublisherMouseClicked
        BooksPanel.setVisible(false);
        AuthorPanel.setVisible(false);
        PublisherPanel.setVisible(true);
        SearchPanel.setVisible(false);
        MainPage.setVisible(false);
        
         fBook = false; 
        fAuthor = false;
        fPublisher = true;
        fSearch = false;
        
        Publisher.setBackground(Color.white);
        Author.setBackground(new Color(204,204,204));
        Book.setBackground(new Color(204,204,204));
        SearchAbtBook.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_PublisherMouseClicked

    private void SearchAbtBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchAbtBookMouseClicked
        BooksPanel.setVisible(false);
        AuthorPanel.setVisible(false);
        PublisherPanel.setVisible(false);
        SearchPanel.setVisible(true);
        MainPage.setVisible(false);

        
         fBook = false; 
        fAuthor = false;
        fPublisher = false;
        fSearch = true;
        
        SearchAbtBook.setBackground(Color.white);
        Author.setBackground(new Color(204,204,204));
        Publisher.setBackground(new Color(204,204,204));
        Book.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_SearchAbtBookMouseClicked

    private void ISBNtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISBNtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ISBNtextActionPerformed

    private void InsertingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertingActionPerformed
        try {      
          connection.ConecctToSQl();
         
         String sql = " insert into Books values(? , ? , ? , ? , ?, ?  );";
         PreparedStatement pstm = con.prepareStatement(sql);
         pstm.setInt(1 , Integer.parseInt(ISBNtext.getText() ));
         pstm.setString(2 , Titletext.getText());
         pstm.setInt(3 , Integer.parseInt(Pricetext.getText() ));
         pstm.setInt(4 , Integer.parseInt(Pagestext.getText() ));
         pstm.setString(5 , Typetext.getText());
         pstm.setInt(6 , Integer.parseInt(P_Code.getText() ));
         
         
         pstm.executeUpdate();
         JOptionPane.showMessageDialog(null,"Book added Successfully");
         con.close();

         
        } catch (ClassNotFoundException | SQLException ex) {

            JOptionPane.showMessageDialog(null,"There is no Publisher by this code");
        }
        catch(NumberFormatException e){
              JOptionPane.showMessageDialog(null,"Type a right values");
        }

    }//GEN-LAST:event_InsertingActionPerformed

    private void DeletingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletingActionPerformed
        try {
            connection.ConecctToSQl();
            String sql = " Delete from Books where ISBN = ?;";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1 , Integer.parseInt(ISBNtext.getText() ));
            
            pstm.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Book Deleted Successfully");

            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_DeletingActionPerformed

    private void BookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookMouseEntered
        Book.setBackground(new Color(204,204,0));
    }//GEN-LAST:event_BookMouseEntered

    private void BookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookMouseExited
       if(fBook)
     Book.setBackground(Color.white);
       else 
     Book.setBackground(new Color(204,204,204));
           
    }//GEN-LAST:event_BookMouseExited

    private void AuthorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AuthorMouseEntered

    Author.setBackground(new Color(204,204,0));
        
    }//GEN-LAST:event_AuthorMouseEntered

    private void AuthorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AuthorMouseExited
      if(fAuthor)
     Author.setBackground(Color.white);
       else 
     Author.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_AuthorMouseExited

    private void PublisherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PublisherMouseEntered
    Publisher.setBackground(new Color(204,204,0));
    }//GEN-LAST:event_PublisherMouseEntered

    private void PublisherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PublisherMouseExited
      if(fPublisher)
     Publisher.setBackground(Color.white);
       else 
     Publisher.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_PublisherMouseExited

    private void SearchAbtBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchAbtBookMouseEntered
       SearchAbtBook.setBackground(new Color(204,204,0));
    }//GEN-LAST:event_SearchAbtBookMouseEntered

    private void SearchAbtBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchAbtBookMouseExited
   if(fSearch)
     SearchAbtBook.setBackground(Color.white);
       else 
     SearchAbtBook.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_SearchAbtBookMouseExited

    private void ExitLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseEntered
       Exit.setBackground(new Color(204,204,0));
    }//GEN-LAST:event_ExitLabelMouseEntered

    private void ExitLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseExited
     Exit.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_ExitLabelMouseExited

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
       Exit.setBackground(new Color(204,204,0));
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
     Exit.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_ExitMouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
       SearchAbtBook.setBackground(new Color(204,204,0));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
   if(fSearch)
     SearchAbtBook.setBackground(Color.white);
       else 
     SearchAbtBook.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
    Publisher.setBackground(new Color(204,204,0));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
  if(fPublisher)
     Publisher.setBackground(Color.white);
       else 
     Publisher.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
    Author.setBackground(new Color(204,204,0));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
   if(fAuthor)
     Author.setBackground(Color.white);
       else 
     Author.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        Book.setBackground(new Color(204,204,0));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        if(fBook)
         Book.setBackground(Color.white);
       else 
          Book.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        BooksPanel.setVisible(true);
        AuthorPanel.setVisible(false);
        PublisherPanel.setVisible(false);
        SearchPanel.setVisible(false);
        MainPage.setVisible(false);

        fBook = true; 
        fAuthor = false;
        fPublisher = false;
        fSearch = false;
        Book.setBackground(Color.white);
        Author.setBackground(new Color(204,204,204));
        Publisher.setBackground(new Color(204,204,204));
        SearchAbtBook.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       BooksPanel.setVisible(false);
        AuthorPanel.setVisible(true);
        PublisherPanel.setVisible(false);
        SearchPanel.setVisible(false);
        MainPage.setVisible(false);

        
        fBook = false; 
        fAuthor = true;
        fPublisher = false;
        fSearch = false;
        Author.setBackground(Color.white);
        Book.setBackground(new Color(204,204,204));
        Publisher.setBackground(new Color(204,204,204));
        SearchAbtBook.setBackground(new Color(204,204,204));    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        BooksPanel.setVisible(false);
        AuthorPanel.setVisible(false);
        PublisherPanel.setVisible(true);
        SearchPanel.setVisible(false);
        MainPage.setVisible(false);

        
         fBook = false; 
        fAuthor = false;
        fPublisher = true;
        fSearch = false;
        
        Publisher.setBackground(Color.white);
        Author.setBackground(new Color(204,204,204));
        Book.setBackground(new Color(204,204,204));
        SearchAbtBook.setBackground(new Color(204,204,204));    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
      BooksPanel.setVisible(false);
        AuthorPanel.setVisible(false);
        PublisherPanel.setVisible(false);
        SearchPanel.setVisible(true);
        MainPage.setVisible(false);
        
         fBook = false; 
        fAuthor = false;
        fPublisher = false;
        fSearch = true;
        
        SearchAbtBook.setBackground(Color.white);
        Author.setBackground(new Color(204,204,204));
        Publisher.setBackground(new Color(204,204,204));
        Book.setBackground(new Color(204,204,204));    }//GEN-LAST:event_jLabel4MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

       MainPage.setVisible(true);
        BooksPanel.setVisible(false);
        AuthorPanel.setVisible(false);
        PublisherPanel.setVisible(false);
        SearchPanel.setVisible(false);
        

    }//GEN-LAST:event_formWindowOpened

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        MainPage.setVisible(true);
        BooksPanel.setVisible(false);
        AuthorPanel.setVisible(false);
        PublisherPanel.setVisible(false);
        SearchPanel.setVisible(false);
       
                
         fBook = false; 
        fAuthor = false;
        fPublisher = false;
        fSearch = false;
        
        SearchAbtBook.setBackground(new Color(204,204,204));
        Author.setBackground(new Color(204,204,204));
        Publisher.setBackground(new Color(204,204,204));
        Book.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel6MouseClicked

    private void P_CodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_CodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P_CodeActionPerformed

    private void PagestextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagestextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PagestextActionPerformed

    private void TitletextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitletextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitletextActionPerformed

    private void PricetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PricetextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PricetextActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void ExitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitLabelMouseClicked

    private void InsertingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertingMouseClicked

    }//GEN-LAST:event_InsertingMouseClicked

    private void UpdatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatingActionPerformed
        try {
            connection.ConecctToSQl();
            String sql = " update Books set Title = ?, Price = ?, Page_count = ?, Book_type = ? , Pcode = ? where isbn = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            
           pstm.setInt(6 , Integer.parseInt(ISBNtext.getText() ));
           pstm.setString(1 , Titletext.getText());
           pstm.setInt(2 , Integer.parseInt(Pricetext.getText() ));
           pstm.setInt(3 , Integer.parseInt(Pagestext.getText() ));
           pstm.setString(4 , Typetext.getText());
           pstm.setInt(5 , Integer.parseInt(P_Code.getText() ));
            
            pstm.executeUpdate();
            
            con.close();
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UpdatingActionPerformed

    private void ShowingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowingActionPerformed
       
 try{
    ((DefaultTableModel)TBook.getModel()).setNumRows(0); 
    connection.ConecctToSQl();
      Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("Select * from Books");
         
         while(rs.next()){
             
             String isbn = String.valueOf(rs.getInt("ISBN"));
             String title = rs.getString("Title");
             String price = String.valueOf(rs.getInt("Price"));
             String pages = String.valueOf(rs.getInt("Page_count"));
             String type = rs.getString("Book_type");
             String publisher = String.valueOf(rs.getInt("Pcode"));
         
             String TbData[] = {isbn,title,price,pages,type,publisher};
             DefaultTableModel TBookModel = (DefaultTableModel)TBook.getModel();
             
            TBookModel.addRow(TbData);
       }
    con.close();    

 }
 catch ( SQLException e){ 
     System.out.println("Error");
 }    
 
 catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ShowingActionPerformed

    private void FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameActionPerformed

    private void AuthorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AuthorIDActionPerformed

    private void InsertingAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertingAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertingAMouseClicked

    private void InsertingAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertingAActionPerformed
  try {      
          connection.ConecctToSQl();
         
         String sql = " insert into Author values(? , ? , ? );";
         PreparedStatement pstm = con.prepareStatement(sql);
         pstm.setInt(1 , Integer.parseInt(AuthorID.getText() ));
         pstm.setString(2 , Fname.getText());
         pstm.setString(3 , Lname.getText());         
         
         pstm.executeUpdate();
         JOptionPane.showMessageDialog(null,"Author added Successfully");
         con.close();

         
        } catch (SQLException | NumberFormatException ex) {

            JOptionPane.showMessageDialog(null,ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_InsertingAActionPerformed

    private void DeletingAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletingAActionPerformed
   try {
            connection.ConecctToSQl();
            String sql = "Delete from Author where Author_ID = ?;";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1 , Integer.parseInt(AuthorID.getText()));
            
            pstm.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Author Deleted Successfully");

            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_DeletingAActionPerformed

    private void UpdatingAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatingAActionPerformed
       try {      
          connection.ConecctToSQl();
         
         String sql = " update Author set Author_FName = ?, Author_LName =? where Author_ID = ?";
         PreparedStatement pstm = con.prepareStatement(sql);
         pstm.setInt(3 , Integer.parseInt(AuthorID.getText() ));
         pstm.setString(1 , Fname.getText());
         pstm.setString(2 , Lname.getText());
         
         
         pstm.executeUpdate();
         JOptionPane.showMessageDialog(null,"Author Updated Successfully");
         con.close();
         
        } catch (SQLException | NumberFormatException ex) {

            JOptionPane.showMessageDialog(null,ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_UpdatingAActionPerformed

    private void ShowingAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowingAActionPerformed

        try{
    ((DefaultTableModel)Tauthor.getModel()).setNumRows(0); 
    ((DefaultTableModel)Trelation.getModel()).setNumRows(0); 
    connection.ConecctToSQl();
      Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("Select * from author;");
         
         
         while(rs.next()){
             
             String ID = String.valueOf(rs.getInt("Author_ID"));
             String AFname = rs.getString("Author_FName");
             String ALname = rs.getString("Author_LName");
         
             String TaData[] = {ID,AFname,ALname};
             DefaultTableModel TAuthorModel = (DefaultTableModel)Tauthor.getModel();
            TAuthorModel.addRow(TaData);
       }
              Statement st = con.createStatement(); 
         ResultSet ms = st.executeQuery("Select * from Books_author;");
       while(ms.next()){
            String Bid = String.valueOf(ms.getInt("b_ISBN"));
            String Aid = String.valueOf(ms.getInt("A_id"));
                
            String TrData[] = {Bid,Aid};
            DefaultTableModel TrelationModel = (DefaultTableModel)Trelation.getModel();
            TrelationModel.addRow(TrData);
       }

         
    con.close();    

 }
 catch ( SQLException e){ 
     System.out.println(e);
 }    
 
 catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }  


    }//GEN-LAST:event_ShowingAActionPerformed

    private void LnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LnameActionPerformed

    private void PCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PCodeActionPerformed

    private void InsertingPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertingPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertingPMouseClicked

    private void InsertingPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertingPActionPerformed
       try {      
          connection.ConecctToSQl();
         
         String sql = " insert into Publisher values(? , ? , ? , ? );";
         PreparedStatement pstm = con.prepareStatement(sql);
         pstm.setInt(1 , Integer.parseInt(PCode.getText() ));
         pstm.setString(2 , Pnametext.getText());
         pstm.setString(3 , Pcity.getText());
         pstm.setString(4 , Pphone.getText());
         
         
         pstm.executeUpdate();
         JOptionPane.showMessageDialog(null,"Publisher added Successfully");
         con.close();

         
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null,"There is already Publisher by this code");
        }
        catch(NumberFormatException e){
              JOptionPane.showMessageDialog(null,"Type a right values");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_InsertingPActionPerformed

    private void PcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PcityActionPerformed

    private void PnametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PnametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PnametextActionPerformed

    private void UpdatingPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatingPActionPerformed
          try {      
          connection.ConecctToSQl();
         
         String sql = " update Publisher set Pname = ?, city =? , phone =?  where Pcode = ?";
         PreparedStatement pstm = con.prepareStatement(sql);
         pstm.setInt(4 , Integer.parseInt(PCode.getText() ));
         pstm.setString(1 , Pnametext.getText());
         pstm.setString(2 , Pcity.getText());
         pstm.setString(3 , Pphone.getText());
         
         
         pstm.executeUpdate();
         JOptionPane.showMessageDialog(null,"Publisher Updated Successfully");
         con.close();

         
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null,"There is no Publisher by this code");
        }
        catch(NumberFormatException e){
              JOptionPane.showMessageDialog(null,"Type a right values");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_UpdatingPActionPerformed

    private void DeletingPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletingPActionPerformed
   try {
            connection.ConecctToSQl();
            String sql = "Delete from Publisher where Pcode = ?;";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1 , Integer.parseInt(PCode.getText()));
            
            pstm.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Publisher Deleted Successfully");

            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_DeletingPActionPerformed

    private void ShowingPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowingPActionPerformed
         try{
    ((DefaultTableModel)TPublisher.getModel()).setNumRows(0); 
    connection.ConecctToSQl();
      Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("Select * from Publisher");
         
         while(rs.next()){
             
             String Pcode = String.valueOf(rs.getInt("Pcode"));
             String Pname = rs.getString("Pname");
             String Pcity = rs.getString("city");
             String Pphone = rs.getString("phone");
         
             String TpData[] = {Pcode,Pname,Pcity,Pphone};
             DefaultTableModel TBookModel = (DefaultTableModel)TPublisher.getModel();
             
            TBookModel.addRow(TpData);
       }
    con.close();    

 }
 catch ( SQLException e){ 
     System.out.println("Error");
 }    
 
 catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }   

    }//GEN-LAST:event_ShowingPActionPerformed

    private void PphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PphoneActionPerformed

    private void SisbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SisbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SisbnActionPerformed

    private void SearchingISBNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchingISBNMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchingISBNMouseClicked

    private void SearchingISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchingISBNActionPerformed
 try{
    ((DefaultTableModel)Tsearch.getModel()).setNumRows(0); 
    connection.ConecctToSQl();
      Statement stmt = con.createStatement();
         String sql = "Select * from Books where ISBN = ?";
         PreparedStatement pstm = con.prepareStatement(sql);
         pstm.setInt(1 , Integer.parseInt(Sisbn.getText()));
         ResultSet rs  = pstm.executeQuery();
         
         while(rs.next()){
             
             String isbn = String.valueOf(rs.getInt("ISBN"));
             String title = rs.getString("Title");
             String price = String.valueOf(rs.getInt("Price"));
             String pages = String.valueOf(rs.getInt("Page_count"));
             String type = rs.getString("Book_type");
             String publisher = String.valueOf(rs.getInt("Pcode"));
         
             String TbData[] = {isbn,title,price,pages,type,publisher};
             DefaultTableModel TBookModel = (DefaultTableModel)Tsearch.getModel();
             
            TBookModel.addRow(TbData);
       }
    con.close();    

 }
 catch ( SQLException | ClassNotFoundException e){ 
           JOptionPane.showMessageDialog(null,e);
 }
    }//GEN-LAST:event_SearchingISBNActionPerformed

    private void sNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sNameActionPerformed

    private void SearchingNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchingNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchingNameMouseClicked

    private void SearchingNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchingNameActionPerformed
 try{
    ((DefaultTableModel)Tsearch.getModel()).setNumRows(0); 
    connection.ConecctToSQl();
      Statement stmt = con.createStatement();
         String sql = "Select * from Books where Title = ?";
         PreparedStatement pstm = con.prepareStatement(sql);
         pstm.setString(1 , sName.getText());
         ResultSet rs  = pstm.executeQuery();
         
         while(rs.next()){
             
             String isbn = String.valueOf(rs.getInt("ISBN"));
             String title = rs.getString("Title");
             String price = String.valueOf(rs.getInt("Price"));
             String pages = String.valueOf(rs.getInt("Page_count"));
             String type = rs.getString("Book_type");
             String publisher = String.valueOf(rs.getInt("Pcode"));
         
             String TbData[] = {isbn,title,price,pages,type,publisher};
             DefaultTableModel TBookModel = (DefaultTableModel)Tsearch.getModel();
             
            TBookModel.addRow(TbData);
       }
    con.close();    

 }
 catch ( SQLException | ClassNotFoundException e){ 
           JOptionPane.showMessageDialog(null,e);
 }
    }//GEN-LAST:event_SearchingNameActionPerformed

    private void TypetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypetextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypetextActionPerformed

    private void BISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BISBNActionPerformed

    private void relationIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relationIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relationIDActionPerformed

    private void InsertingA1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertingA1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertingA1MouseClicked

    private void InsertingA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertingA1ActionPerformed

  try {      
          connection.ConecctToSQl();
         
         String sql = " insert into Books_author values( ? , ? );";
         PreparedStatement pstm = con.prepareStatement(sql);
         pstm.setInt(1 , Integer.parseInt(BISBN.getText() ));
         pstm.setInt(2 , Integer.parseInt(relationID.getText() ));
       
         
         pstm.executeUpdate();
         JOptionPane.showMessageDialog(null,"Relation added Successfully");
         con.close();

         
        } catch (SQLException | NumberFormatException ex) {

            JOptionPane.showMessageDialog(null,ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_InsertingA1ActionPerformed

    private void DeletingA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletingA1ActionPerformed
           try {
            connection.ConecctToSQl();
            String sql = "Delete from books_author where b_ISBN = ? and A_id = ? ;";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1 , Integer.parseInt(BISBN.getText()));
            pstm.setInt(2 , Integer.parseInt(relationID.getText()));
            
            pstm.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Relation Deleted Successfully");

            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_DeletingA1ActionPerformed

    private void UpdatingA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatingA1ActionPerformed
       try {      
          connection.ConecctToSQl();
         
         String sql = " update books_author set  A_id =? where b_ISBN = ?";
         PreparedStatement pstm = con.prepareStatement(sql);
              pstm.setInt(2 , Integer.parseInt(BISBN.getText()));
            pstm.setInt(1 , Integer.parseInt(relationID.getText()));
         
         pstm.executeUpdate();
         JOptionPane.showMessageDialog(null,"Relation Updated Successfully");
         con.close();

         
        } catch (SQLException | NumberFormatException | ClassNotFoundException ex) {

            JOptionPane.showMessageDialog(null,ex);
        }


    }//GEN-LAST:event_UpdatingA1ActionPerformed

    
 
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel Author;
    private javax.swing.JTextField AuthorID;
    private javax.swing.JPanel AuthorPanel;
    private javax.swing.JTextField BISBN;
    private java.awt.Panel Book;
    private javax.swing.JPanel BooksPanel;
    private javax.swing.JButton Deleting;
    private javax.swing.JButton DeletingA;
    private javax.swing.JButton DeletingA1;
    private javax.swing.JButton DeletingP;
    private java.awt.Panel Exit;
    private javax.swing.JLabel ExitLabel;
    private javax.swing.JTextField Fname;
    private javax.swing.JPanel Home;
    private javax.swing.JTextField ISBNtext;
    private javax.swing.JButton Inserting;
    private javax.swing.JButton InsertingA;
    private javax.swing.JButton InsertingA1;
    private javax.swing.JButton InsertingP;
    private javax.swing.JTextField Lname;
    private javax.swing.JPanel MainPage;
    private javax.swing.JPanel Menu;
    private javax.swing.JTextField PCode;
    private javax.swing.JTextField P_Code;
    private javax.swing.JTextField Pagestext;
    private javax.swing.JTextField Pcity;
    private javax.swing.JTextField Pnametext;
    private javax.swing.JTextField Pphone;
    private javax.swing.JTextField Pricetext;
    private java.awt.Panel Publisher;
    private javax.swing.JPanel PublisherPanel;
    private java.awt.Panel SearchAbtBook;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JLabel Searching;
    private javax.swing.JButton SearchingISBN;
    private javax.swing.JButton SearchingName;
    private javax.swing.JLabel Searchingn;
    private javax.swing.JButton Showing;
    private javax.swing.JButton ShowingA;
    private javax.swing.JButton ShowingP;
    private javax.swing.JTextField Sisbn;
    private javax.swing.JTable TBook;
    private javax.swing.JTable TPublisher;
    private javax.swing.JTable Tauthor;
    private javax.swing.JTextField Titletext;
    private javax.swing.JTable Trelation;
    private javax.swing.JTable Tsearch;
    private javax.swing.JTextField Typetext;
    private javax.swing.JButton Updating;
    private javax.swing.JButton UpdatingA;
    private javax.swing.JButton UpdatingA1;
    private javax.swing.JButton UpdatingP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField relationID;
    private javax.swing.JTextField sName;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Ico.png")));
    }
}
